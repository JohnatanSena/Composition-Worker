package application;

import model.entities.Department;
import model.entities.HourContract;
import model.entities.Worker;
import model.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.println("Entre com os dados do colaborador");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível de classificação de cargo: ");
        String workerLevel = sc.nextLine();
        System.out.print("Digite o salário base ");
        Double workerBaseSalary = sc.nextDouble();

        Department department = new Department(departmentName);
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, department);

        System.out.print("Quantos contratos para o colaborador? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Digite o contrato #" + (i + 1) + ": ");
            System.out.print("Qual a data do contrato? ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duração em horas: ");
            Integer duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Digite Mês/Ano para calcular o pagamento (MM/AAAA): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println(worker);
        System.out.println("Pagamento " + monthAndYear + " R$ " + String.format("%.2f", worker.income(month, year)));

    }
}
