package ksyun.client.slb.removeprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemovePrivateLinkRequest
* @Description 请求参数
*/
@Data
public class RemovePrivateLinkRequest{
    /**PrivateLinkServer的ID*/
    @KsYunField(name="PrivateLinkServerId")
    private String PrivateLinkServerId;

    /**PrivateLink的ID*/
    @KsYunField(name="PrivateLinkId")
    private String PrivateLinkId;

}
