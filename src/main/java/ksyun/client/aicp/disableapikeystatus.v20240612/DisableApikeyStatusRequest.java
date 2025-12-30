package ksyun.client.aicp.disableapikeystatus.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisableApikeyStatusRequest
* @Description 请求参数
*/
@Data
public class DisableApikeyStatusRequest{
    /**API Key的ID*/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**启禁用状态：1启用，2禁用*/
    @KsYunField(name="Status")
    private String Status;

}
