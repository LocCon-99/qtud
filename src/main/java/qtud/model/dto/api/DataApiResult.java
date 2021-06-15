package qtud.model.dto.api;

public class DataApiResult extends BaseApiResult {

    private Object result;

    public Object getData() {
        return result;
    }

    public void setData(Object result) {
        this.result = result;
    }
}
