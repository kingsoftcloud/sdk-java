package ksyun.client.cloud_advisor.listinspectionitem.v20250610;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListInspectionItemRequest
* @Description 请求参数
*/
@Data
public class ListInspectionItemRequest{
    /**分页数 最小值 1*/
    @KsYunField(name="pageNum")
    private Integer PageNum;

    /**分页大小，最小值 1，最大值 100*/
    @KsYunField(name="pageSize")
    private Integer PageSize;

}
