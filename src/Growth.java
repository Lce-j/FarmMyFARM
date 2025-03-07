public class Growth {
    int initAnimalStageGrowth = 0;
    int speedAnimalGrowth1 = 0;
    int speedAnimalGrowth2 = 0;

    int initCropStageGrowth = 0;
    int speedCropGrowth1 = 0;
    int speedCropGrowth2 = 0;

    public Growth() {
        while (initAnimalStageGrowth == 0 && speedAnimalGrowth1 != 30) {
            speedAnimalGrowth1++;
            if (speedAnimalGrowth1 == 30) {
                initAnimalStageGrowth++;
            }
        }
        while (initAnimalStageGrowth == 1 && speedAnimalGrowth2 != 45) {
            speedAnimalGrowth2++;
            if (speedAnimalGrowth2 == 45) {
                initAnimalStageGrowth++;
            }
        }

        while (initCropStageGrowth == 0 && speedCropGrowth1 != 30) {
            speedCropGrowth1++;
            if (speedCropGrowth1 == 30) {
                initCropStageGrowth++;
            }
        }
        while (initCropStageGrowth == 1 && speedCropGrowth2 != 45) {
            speedCropGrowth2++;
            if (speedCropGrowth2 == 45) {
                initCropStageGrowth++;
            }
        }
    }
}
