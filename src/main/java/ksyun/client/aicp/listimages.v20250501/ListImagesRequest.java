package ksyun.client.aicp.listimages.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListImagesRequest
 * @Description 请求参数
 */
@Data
public class ListImagesRequest {
    /**
     * 必须是1或者2。
     * 1是个人镜像，2是公共镜像
     */
    @KsYunField(name = "image_label")
    private Integer Image_label;

    /**
     * available(正常)，synchronous（同步中），abnormal（异常），unavailable（不可用）
     */
    @KsYunField(name="status")
    private String Status;

    /**
     * 页码
     */
    @KsYunField(name = "page_index")
    private Integer Page_index;

    /**每页数据条数*/
    @KsYunField(name="page_size")
    private Integer Page_size;

}