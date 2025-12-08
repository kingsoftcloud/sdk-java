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
        private GpuDto Gpu;

        @Data
        @ToString
        public static class GpuDto {
        }

        /***/
        @JsonProperty("Rdma")
        private RdmaDto Rdma;

        @Data
        @ToString
        public static class RdmaDto {
        }

        /***/
        @JsonProperty("Processor")
        private ProcessorDto Processor;

        @Data
        @ToString
        public static class ProcessorDto {
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
        private MemoryDto Memory;

        @Data
        @ToString
        public static class MemoryDto {
            /**8192*/
            @JsonProperty("Size")
            private Integer Size;

            /**0*/
            @JsonProperty("EncryptedSize")
            private Integer EncryptedSize;

        }

        /***/
        @JsonProperty("LocalVolumes")
    }

    /**bHpwdXJja2RxemU1eG5sb3NzdGcW1-RCEq*******/
    @JsonProperty("NextToken")
    private String NextToken;

}
