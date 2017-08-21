package jp.co.humane.sample.api.helloworld;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.humane.sample.common.dto.ApiResult;

/**
 * サンプルコントローラ
 * @author terada
 *
 */
@RestController
public class HelloWorldController {

    @PostMapping("/helloworld")
    @ResponseBody
    public ApiResult<HelloWorldResponse> getMessage(HelloWorldRequest req) {

        ApiResult<HelloWorldResponse> apiResult = new ApiResult<>();

        String message = "IDは" + req.getId() + "、名前は" + req.getName();
        HelloWorldResponse res = new HelloWorldResponse();
        res.setMessage(message);
        apiResult.setResultInfo(res);

        return apiResult;
    }
}
