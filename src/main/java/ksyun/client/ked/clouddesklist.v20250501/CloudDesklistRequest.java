package ksyun.client.ked.clouddesklist.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloudDesklistRequest
 * @Description 请求参数
 */
@Data
public class CloudDesklistRequest {
    /***/
    @KsYunField(name = "page")
    private Integer Page;

    /***/
    @KsYunField(name = "size")
    private Integer Size;

    /**
     * on
     * off
     */
    @KsYunField(name = "connected")
    private String Connected;

}