package ksyun.client.slb.deleteprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeletePrivateLinkRequest
* @Description 请求参数
*/
@Data
public class DeletePrivateLinkRequest{
    /**PrivateLink的ID*/
    @KsYunField(name="PrivateLinkId")
    private String PrivateLinkId;

}
