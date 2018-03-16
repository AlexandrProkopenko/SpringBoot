package web.loggers;



import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class ContactDAOLogger {

    private final Logger logger =
            LoggerFactory.getLogger(ContactDAOLogger.class);

    /* @Pointcut - точка входа для обработки событий
    * до и после вызова метода.*/

    @Pointcut("execution(* web.dao.ContactsDAO.create(..))")
    private void createPointcut(){}

    @Pointcut("execution(* web.dao.ContactsDAO.getAll())")
    private void createGetAllPointcut(){}

    /*5 разных событий
    * @Before - позволяет нам выполнить действие до запуска метода
    * @After  - позволяет выполнить действия после запуска метода
    *   Подгруппы
    *   @AfterReturning - успешно
    *   @AfterThrowing - не успешно
    * @Around - обернуть метод до и после*/

    @Before("createPointcut()")
    private void beforeCreateContact(){
        logger.info("Вызываем метод create()...");
    }

    @After("createPointcut()")
    private void afterCreateContact(){
        logger.info("Завершаем метод create()...");
    }

    @AfterReturning(value = "createPointcut()", returning = "id")
    private void afterReturningCreate(Object id){
        logger.info("Id сгенерированый для Contact - " + (Long)id);
    }

    @AfterThrowing(value = "createPointcut()", throwing = "exc")
    private void afterThrowingCreate(Throwable exc){
        logger.info("Что то нажал и все упало");
        new Throwable("Что то нажал и все упало", exc);
    }
}
