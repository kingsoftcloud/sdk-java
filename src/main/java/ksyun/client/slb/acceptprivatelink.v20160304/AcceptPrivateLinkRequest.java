package ksyun.client.slb.acceptprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AcceptPrivateLinkRequest
* @Description 请求参数
*/
@Data
public class AcceptPrivateLinkRequest{
    /**PrivateLink的ID*/
    @KsYunField(name="PrivateLinkId")
    private String PrivateLinkId;

}