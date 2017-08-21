package jp.co.humane.sample.common.dto;

/**
 * 共通の処理結果格納クラス。
 *
 * @param <T> 処理結果の型。
 * @author terada
 *
 */
public class ApiResult<T> {

    /** 処理結果コード */
    protected String resultCode = null;

    /** 処理結果 */
    protected T resultInfo = null;

    /**
     * resultCodeを取得する。
     * @return resultCode resultCode。
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * resultCodeを設定する。
     * @param resultCode resultCode。
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * resultInfoを取得する。
     * @return resultInfo resultInfo。
     */
    public T getResultInfo() {
        return resultInfo;
    }

    /**
     * resultInfoを設定する。
     * @param resultInfo resultInfo。
     */
    public void setResultInfo(T resultInfo) {
        this.resultInfo = resultInfo;
    }
}
