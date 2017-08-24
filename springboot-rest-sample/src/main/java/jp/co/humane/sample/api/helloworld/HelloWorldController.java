package jp.co.humane.sample.api.helloworld;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.humane.sample.common.consts.ResultCode;
import jp.co.humane.sample.common.dto.ApiResult;
import jp.co.humane.sample.common.utils.ValidationUtils;

/**
 * サンプルコントローラ
 * @author terada
 *
 */
@RestController
public class HelloWorldController {

    @PostMapping("/helloworld")
    @ResponseBody
    public ApiResult<HelloWorldResponse>
        getMessage(@RequestBody @Valid HelloWorldRequest req, BindingResult result) {

        ApiResult<HelloWorldResponse> apiResult = new ApiResult<>();

        if (result.hasErrors()) {

            apiResult.setResultCode(ResultCode.VALIDATION_ERROR);
            apiResult.setErrorList(ValidationUtils.getErrorList(result));

        } else {

            String message = "IDは" + req.getId() + "、名前は" + req.getName();
            HelloWorldResponse res = new HelloWorldResponse();
            res.setMessage(message);
            apiResult.setResultInfo(res);
        }

        return apiResult;
    }
}
