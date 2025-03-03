package ksyun.client.krds.describeengineparametersmodifyhistory.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeEngineParametersModifyHistoryRequest
 * @Description 请求参数
 */
@Data
public class DescribeEngineParametersModifyHistoryRequest {
    /**
     * 参数组ID	通过[参数组-列表（详情）接口](https://docs.ksyun.com/documents/344)获取
     */
    @KsYunField(name = "DBParameterGroupId")
    private String DBParameterGroupId;

    /**
     * 修改参数名称。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 每页记录条数。（默认为10）
     */
    @KsYunField(name = "MaxRecords")
    private Integer MaxRecords;

    /**
     * 第n页数。默认为0。
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

}