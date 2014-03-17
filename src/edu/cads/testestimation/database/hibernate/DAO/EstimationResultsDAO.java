package edu.cads.testestimation.database.hibernate.DAO;


import edu.cads.testestimation.database.hibernate.logic.EstimationResults;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Ari100tell on 16.03.2014.
 */
public interface EstimationResultsDAO {
    /**
     * Добавить результаты тестирования
     *
     * @param estimationResults результаты тестирования
     * @throws SQLException
     */
    public void addEstimationResults(EstimationResults estimationResults) throws SQLException;

    /**
     * Обновить результаты тестирования
     *
     * @param estimationResults новые результаты для обновления
     * @throws SQLException
     */
    public void updateEstimationResults(EstimationResults estimationResults) throws SQLException;

    /**
     * Получить результаты тестирования по заданному номеру отчета
     *
     * @param estimationNumber номер для получения соответствуищих результатов тестирования
     * @return
     * @throws SQLException
     */
    public EstimationResults getEstimationResultsByEstimationNumber(Integer estimationNumber) throws SQLException;

    /**
     * Получить все результаты тестирования
     *
     * @return возвращает список результатов тестирования
     * @throws SQLException
     */
    public List getAllEstimationResults() throws SQLException;

    /**
     * Удалить результаты тестирования
     *
     * @return удаляет заданные результаты с базы
     * @throws SQLException
     */
    public void deleteEstimationResults(EstimationResults estimationResults) throws SQLException;
}
