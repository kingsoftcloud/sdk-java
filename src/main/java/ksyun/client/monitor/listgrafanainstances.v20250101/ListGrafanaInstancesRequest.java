package ksyun.client.monitor.listgrafanainstances.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListGrafanaInstancesRequest
* @Description 请求参数
*/
@Data
public class ListGrafanaInstancesRequest{
    /**页号，起始值：1*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**每页显示的数据行数。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
