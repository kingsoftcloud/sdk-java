package ksyun.client.aicp.describeimages.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeImagesRequest
* @Description 请求参数
*/
@Data
public class DescribeImagesRequest{
    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**镜像来源*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**镜像状态*/
    @KsYunField(name="ImageStatus")
    private String ImageStatus;

    /**镜像类型*/
    @KsYunField(name="ImageType")
    private String ImageType;

    /**适用场景*/
    @KsYunField(name="ApplicationScenario")
    private String ApplicationScenario;

    /**镜像ID*/
    @KsYunField(name="ImageId",type=1)
    private List<String> ImageIdList;

    /**镜像名称*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- image-frame, 镜像框架*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

}
