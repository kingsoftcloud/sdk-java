package ksyun.client.aicp.listdataset.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListDatasetRequest
 * @Description 请求参数
 */
@Data
public class ListDatasetRequest {
    /***/
    @KsYunField(name = "Page")
    private Integer Page;

    /***/
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * [模糊搜索]-数据集名称
     */
    @KsYunField(name = "DatasetName")
    private String DatasetName;

    /**
     * [模糊搜索]-数据集主题
     * • 具身智能
     * • 大模型
     * • 自动驾驶
     */
    @KsYunField(name = "Topic")
    private String Topic;

    /**
     * [模糊搜索]-数据集来源
     * • GitHub
     * • HuggingFace
     * • arXiv
     */
    @KsYunField(name = "HostName")
    private String HostName;

    /**
     * [模糊搜索]-关键词
     */
    @KsYunField(name = "Keywords")
    private String Keywords;

    /**
     * 提供商
     * • 0-金山云
     * • 1-遇见
     */
    @KsYunField(name = "Source")
    private String Source;

}