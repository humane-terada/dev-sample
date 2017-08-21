package jp.co.humane.sample.api.helloworld;

/**
 * サンプルリクエストデータ。
 * @author terada
 *
 */
public class HelloWorldRequest {

    /** ID */
    private Integer id = null;

    /** 名前 */
    private String name = null;

    /**
     * idを取得する。
     * @return id id。
     */
    public Integer getId() {
        return id;
    }

    /**
     * idを設定する。
     * @param id id。
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * nameを取得する。
     * @return name name。
     */
    public String getName() {
        return name;
    }

    /**
     * nameを設定する。
     * @param name name。
     */
    public void setName(String name) {
        this.name = name;
    }
}
