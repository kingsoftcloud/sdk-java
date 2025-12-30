package ksyun.client.aicp.activateapiservice.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ActivateApiServiceRequest
* @Description 请求参数
*/
@Data
public class ActivateApiServiceRequest{
    /**状态：1 表示开通服务*/
    @KsYunField(name="Status")
    private String Status;

}
