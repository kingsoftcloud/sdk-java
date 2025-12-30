package ksyun.client.kcrs.schedule.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ScheduleResponse
* @Description Schedule 返回体
*/
@Data
@ToString
public class ScheduleResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("Requestid")
    private String Requestid;

    /**执行信息*/
    @JsonProperty("Data")
    private String Data;

}
