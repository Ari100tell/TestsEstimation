package edu.cads.testestimation.database.hibernate;


import edu.cads.testestimation.database.hibernate.DAO.Factory;
import edu.cads.testestimation.database.hibernate.logic.EstimationResults;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        //Создадим двух студентов
        EstimationResults s1 = new EstimationResults();
        EstimationResults s2 = new EstimationResults();
      /*
        //Проинициализируем их
        s1.setImplementationPlanName("Morochenets Ivan");
        s1.setImplementationPlanVersion(22);

        s2.setImplementationPlanName("Petr Aliss");
        s2.setImplementationPlanVersion(24);

        //Сохраним их в бд, id будут сгенерированы автоматически
        Factory.getInstance().getEstimationResultsDAO().addEstimationResults(s1);
        Factory.getInstance().getEstimationResultsDAO().addEstimationResults(s2);
           */
        //Выведем всех студентов из бд
        List<EstimationResults> studs = Factory.getInstance().getEstimationResultsDAO().getAllEstimationResults();
        System.out.println("========Все результаты тестирования=========");
        for (int i = 0; i < studs.size(); ++i) {
            System.out.println("Имя проекта : " + studs.get(i).getImplementationPlanName() + ", Версия : " + studs.get(i).getImplementationPlanVersion() + ",  id : " + studs.get(i).getEstimationNumber());
            System.out.println("=============================");
        }


    }
}