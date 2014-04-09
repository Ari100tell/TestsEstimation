package edu.cads.testestimation.database.hibernate;


import edu.cads.testestimation.database.hibernate.DAO.factory.SystemTestingResultsFactory;
import edu.cads.testestimation.database.hibernate.logic.SystemTestingResults;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        //Создадим двух студентов
      /*  EstimationResults s1 = new EstimationResults();
        EstimationResults s2 = new EstimationResults();
/*
        //Проинициализируем их
        s1.setImplementationPlanNumber("Morochenets Iva56n");
        s1.setImplementationPlanVersion(22);
        s1.setEstimationDate("14.03.2014");
        s1.setEstimationNumber(1);
        s1.setExpectedIncome(11l);
        s1.setInternalResultsDate("14.03.2014");
        s1.setNeedIntroduction(true);
        s1.setSuccessProbability(2);
        s1.setIntroducingResultNumber(1);
         /*
        s2.setImplementationPlanName("Petr Aliss");
        s2.setImplementationPlanVersion(24);

        //Сохраним их в бд, id будут сгенерированы автоматически
        EstimationResultFactory.getInstance().getEstimationResultsDAO().addEstimationResults(s1);
        EstimationResultFactory.getInstance().getEstimationResultsDAO().addEstimationResults(s2);
                                                 */
        //Выведем всех студентов из бд
        /*List<EstimationResults> studs = EstimationResultFactory.getInstance().getEstimationResultsDAO().getAllEstimationResults();
        System.out.println("========Все результаты тестирования=========");
        for (int i = 0; i < studs.size(); ++i) {
            System.out.println("Имя проекта : " + studs.get(i).getImplementationPlanNumber() + ", Версия : " + studs.get(i).getImplementationPlanNumber() + ",  id : " + studs.get(i).getEstimationNumber());
            System.out.println("=============================");
        }    */
        SystemTestingResults systemTestingResults = new SystemTestingResults();
        systemTestingResults = SystemTestingResultsFactory.getInstance().getSystemTestingResultsDAO().getSystemTestingResultsBySystemTestingNumber(1);
        System.out.println(systemTestingResults.getSystemTestingNumber());

    }
}