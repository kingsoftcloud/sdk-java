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
        private InstanceTypesGpuDto Gpu;

        @Data
        @ToString
        public static class InstanceTypesGpuDto {
        }

        /***/
        @JsonProperty("Rdma")
        private InstanceTypesRdmaDto Rdma;

        @Data
        @ToString
        public static class InstanceTypesRdmaDto {
        }

        /***/
        @JsonProperty("Processor")
        private InstanceTypesProcessorDto Processor;

        @Data
        @ToString
        public static class InstanceTypesProcessorDto {
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
        private InstanceTypesMemoryDto Memory;

        @Data
        @ToString
        public static class InstanceTypesMemoryDto {
            /**8192*/
            @JsonProperty("Size")
            private Integer Size;

            /***/
            @JsonProperty("EncryptedSize")
            private Integer EncryptedSize;

        }

        /***/
        @JsonProperty("LocalVolumes")
        private List<InstanceTypesLocalVolumesDto> LocalVolumes;

        @Data
        @ToString
        public static class InstanceTypesLocalVolumesDto {
            /**硬盘大小*/
            @JsonProperty("Size")
            private Integer Size;

            /**硬盘数量*/
            @JsonProperty("Count")
            private Integer Count;

            /**硬盘类型*/
            @JsonProperty("VolumeType")
            private String VolumeType;

        }

    }

    /**bHpwdXJja2RxemU1eG5sb3NzdGcW1-RCEq*******/
    @JsonProperty("NextToken")
    private String NextToken;

}
