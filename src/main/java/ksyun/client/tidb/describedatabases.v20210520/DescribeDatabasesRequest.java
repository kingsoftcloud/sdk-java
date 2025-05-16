package ksyun.client.tidb.describedatabases.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeDatabasesRequest
 * @Description 请求参数
 */
@Data
public class DescribeDatabasesRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}