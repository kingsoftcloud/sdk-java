package ksyun.client.epc.describesoinstancetypes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoInstanceTypesResponse
* @Description DescribeSoInstanceTypes 返回体
*/
@Data
@ToString
public class DescribeSoInstanceTypesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("InstanceTypes")
    private List<InstanceTypesDto> InstanceTypes;

    @Data
    @ToString
    public static class InstanceTypesDto {
        /***/
        @JsonProperty("Gpu")
        private InstanceTypesDtoGpuDto Gpu;

        @Data
        @ToString
        public static class InstanceTypesDtoGpuDto {
        }

        /***/
        @JsonProperty("Rdma")
        private InstanceTypesDtoRdmaDto Rdma;

        @Data
        @ToString
        public static class InstanceTypesDtoRdmaDto {
        }

        /***/
        @JsonProperty("Processor")
        private InstanceTypesDtoProcessorDto Processor;

        @Data
        @ToString
        public static class InstanceTypesDtoProcessorDto {
            /**2*/
            @JsonProperty("Cpus")
            private Integer Cpus;

            /**Intel Xeon(Ice Lake) Platinum 8336C*/
            @JsonProperty("Model")
            private String Model;

            /**2.3*/
            @JsonProperty("BaseFrequency")
            private Double BaseFrequency;

            /**3*/
            @JsonProperty("TurboFrequency")
            private Integer TurboFrequency;

        }

        /***/
        @JsonProperty("Memory")
        private InstanceTypesDtoMemoryDto Memory;

        @Data
        @ToString
        public static class InstanceTypesDtoMemoryDto {
            /**8192*/
            @JsonProperty("Size")
            private Integer Size;

            /***/
            @JsonProperty("EncryptedSize")
            private Integer EncryptedSize;

        }
    }

    /**bHpwdXJja2RxemU1eG5sb3NzdGcW1-RCEq*******/
    @JsonProperty("NextToken")
    private String NextToken;

}
