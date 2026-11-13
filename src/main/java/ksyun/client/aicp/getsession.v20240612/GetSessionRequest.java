package ksyun.client.aicp.getsession.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSessionRequest
* @Description 请求参数
*/
@Data
public class GetSessionRequest{
    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="Id")
    private String Id;

}
