package ksyun.client.slb.deletehostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteHostHeaderRequest
* @Description 请求参数
*/
@Data
public class DeleteHostHeaderRequest{
    /**域名的ID*/
    @KsYunField(name="HostHeaderId")
    private String HostHeaderId;


}