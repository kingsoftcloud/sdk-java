package ksyun.client.dts.createconsistencycheck.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateConsistencyCheckRequest
* @Description 请求参数
*/
@Data
public class CreateConsistencyCheckRequest{
    /**主任务ID。*/
    @KsYunField(name="TaskId")
    private String TaskId;

}
