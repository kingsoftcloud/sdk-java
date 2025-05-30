package ksyun.client.slb.setalbname.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetAlbNameRequest
 * @Description 请求参数
 */
@Data
public class SetAlbNameRequest {
    /**
     * 应用型负载均衡的ID
     */
    @KsYunField(name = "AlbId")
    private String AlbId;

    /**
     * 应用型负载均衡的名称
     */
    @KsYunField(name = "AlbName")
    private String AlbName;

}