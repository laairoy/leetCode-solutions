package codes.averageSalary;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class AverageSalary {
    public double average(int[] salary) {
        // Opcao 3 (mais rápido)
        double max, min, average;
        average = salary[0];
        max = salary[0];
        min = salary[0];

        for(int i = 1; i < salary.length ; i++){
            if(max < salary[i]) max = salary[i];
            if(min > salary[i]) min = salary[i];

            average += salary[i];
        }

        average -= max;
        average -= min;

        return average/(salary.length -2);

        // Opcao 2
//        double average = 0;
//        Arrays.sort(salary);
//        for(int i = 1 ; i < salary.length - 1 ; i++){
//            average += salary[i];
//        }
//        return average/(salary.length -2);

        // Opcao 1
//          return Arrays.stream(salary)
//                  .sorted()
//                  .limit(salary.length - 1)
//                  .skip(1)
//                  .average().getAsDouble();
    }
}
