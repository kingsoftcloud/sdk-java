package ksyun.client.aicp.deletesession.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSessionRequest
* @Description 请求参数
*/
@Data
public class DeleteSessionRequest{
    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="Id")
    private String Id;

}
