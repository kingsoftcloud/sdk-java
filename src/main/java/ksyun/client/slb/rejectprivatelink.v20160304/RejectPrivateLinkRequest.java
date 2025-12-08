package ksyun.client.slb.rejectprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RejectPrivateLinkRequest
* @Description 请求参数
*/
@Data
public class RejectPrivateLinkRequest{
    /**PrivateLink的ID*/
    @KsYunField(name="PrivateLinkId")
    private String PrivateLinkId;

}
