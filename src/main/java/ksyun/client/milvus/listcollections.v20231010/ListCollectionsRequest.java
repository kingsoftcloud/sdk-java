package ksyun.client.milvus.listcollections.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListCollectionsRequest
* @Description 请求参数
*/
@Data
public class ListCollectionsRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**默认0开始，为第一页*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**每页展示条数*/
    @KsYunField(name="Limit")
    private Integer Limit;

}
