package ksyun.client.kls.resumestream.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResumeStreamResponse
* @Description ResumeStream 返回体
*/
@Data
@ToString
public class ResumeStreamResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ResumeStreamResponse")
    private String ResumeStreamResponse;

}
