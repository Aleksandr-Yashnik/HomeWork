import java.util.Random;

public class FactoryPartsAnalysis {
    public static void main(String[] args) {
        int[] details = new int[3];
        Random random = new Random();
        for (int i = 0; i < details.length; i++) {
            details[i] = random.nextInt(3) - 1;
            int DefectiveParts = 0;
            int NeedsImprovement = 0;
            int PerfectDetails = 0;
            for (int detail : details) {
                if (detail == -1) {
                    DefectiveParts++;
                } else if (detail == 0) {
                    NeedsImprovement++;
                } else if (detail == 1) {
                    PerfectDetails++;
                }
            }
            double ratioDefectiveParts = (DefectiveParts / (double) details.length) * 100;
            double ratioNeedsImprovement = (NeedsImprovement / (double) details.length) * 100;
            double ratioPerfectDetails = (PerfectDetails / (double) details.length) * 100;


            System.out.printf("Процент бракованных деталей: %.2f%%%n" ,  ratioDefectiveParts);
           System.out.printf("Процент деталей, требующих доработки: %.2f%%%n", ratioNeedsImprovement);
           System.out.printf("Процент идеальных деталей: %.2f%%%n", ratioPerfectDetails);
        }
    }
}
