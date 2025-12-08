package ksyun.client.cloud_advisor.createtask.v20250610;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTaskRequest
* @Description 请求参数
*/
@Data
public class CreateTaskRequest{
    /**要发起巡检的巡检项 ID 列表*/
    @KsYunField(name="inspectionItemIDs",type=2)
    private List<Integer> InspectionItemIDsList;

    /**要发起巡检的产品线 ID 列表*/
    @KsYunField(name="productGroupIds",type=2)
    private List<Integer> ProductGroupIdsList;

    /**要发起巡检的巡检维度列表
1 安全
2 可靠
3 性能
4 成本
5 限制*/
    @KsYunField(name="inspectionItemTypes",type=2)
    private List<Integer> InspectionItemTypesList;

}
