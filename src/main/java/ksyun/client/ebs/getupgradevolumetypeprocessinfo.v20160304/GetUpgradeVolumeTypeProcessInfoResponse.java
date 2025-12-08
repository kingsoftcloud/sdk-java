package ksyun.client.ebs.getupgradevolumetypeprocessinfo.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUpgradeVolumeTypeProcessInfoResponse
* @Description GetUpgradeVolumeTypeProcessInfo 返回体
*/
@Data
@ToString
public class GetUpgradeVolumeTypeProcessInfoResponse extends BaseResponseModel {
    /**267168cc-28c6-4991-85d0-e851c5d6c49b*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Result")
    private List<ResultDto> Result;

    @Data
    @ToString
    public static class ResultDto {
        /**9d62d051-a5e7-49d4-920c-b0ffb4d9d2c3*/
        @JsonProperty("VolumeId")
        private String VolumeId;

        /***/
        @JsonProperty("Process")
        private ProcessDto Process;

        @Data
        @ToString
        public static class ProcessDto {
            /**0*/
            @JsonProperty("PrepareProcess")
            private Integer PrepareProcess;

            /**0*/
            @JsonProperty("LatestDataProcess")
            private Integer LatestDataProcess;

            /**false*/
            @JsonProperty("PrepareDone")
            private Boolean PrepareDone;

            /**false*/
            @JsonProperty("LatestDataDone")
            private Boolean LatestDataDone;

            /**0*/
            @JsonProperty("EstimatedDuring")
            private Integer EstimatedDuring;

        }

    }

}
