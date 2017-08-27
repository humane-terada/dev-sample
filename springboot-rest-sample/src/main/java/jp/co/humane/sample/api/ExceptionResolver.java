package jp.co.humane.sample.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import jp.co.humane.sample.common.consts.LogId;
import jp.co.humane.sample.common.exception.HelloWorldException;

/**
 * 例外処理をハンドリングする。
 * @author terada
 *
 */
@ControllerAdvice
public class ExceptionResolver {

    /** ロガー */
    private static final Logger log = LoggerFactory.getLogger(ExceptionResolver.class);

    /**
     * HelloWorldException例外が発生した場合は500(サーバエラー)を返す。
     * @param ex 例外。
     */
    @ExceptionHandler(HelloWorldException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void onServerError(HelloWorldException ex) {
        log.error(LogId.E0001, ex);
    }

    /**
     * 上記以外の例外が発生した場合は500(サーバエラー)を返す。
     * @param ex 例外。
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void onError(Exception ex) {
        log.error(LogId.E0002, ex);
    }
}
