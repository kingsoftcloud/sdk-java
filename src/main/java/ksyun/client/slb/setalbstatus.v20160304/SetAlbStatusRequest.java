package ksyun.client.slb.setalbstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetAlbStatusRequest
* @Description 请求参数
*/
@Data
public class SetAlbStatusRequest{
    /**应用型负载均衡的ID*/
    @KsYunField(name="AlbId")
    private String AlbId;

    /**应用型负载均衡的开启状态(start|stop)*/
    @KsYunField(name="State")
    private String State;


}