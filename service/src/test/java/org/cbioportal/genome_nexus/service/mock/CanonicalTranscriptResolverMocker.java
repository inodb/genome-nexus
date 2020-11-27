package org.cbioportal.genome_nexus.service.mock;

import org.cbioportal.genome_nexus.model.VariantAnnotation;
import org.cbioportal.genome_nexus.service.annotation.CanonicalTranscriptResolver;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

public class CanonicalTranscriptResolverMocker
{
    public void mockMethods(Map<String, VariantAnnotation> variantMockData,
                             CanonicalTranscriptResolver canonicalTranscriptResolver)
    {
        String[] isoformOverrideSources = {"uniprot", "mskcc"};

        for (String isoformOverrideSource : isoformOverrideSources) {
            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("1:g.65325832_65325833insG"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("1:g.65325832_65325833insG").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("3:g.14106026_14106037del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("3:g.14106026_14106037del").getTranscriptConsequences().get(1)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("3:g.14940279_14940280insCAT"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("3:g.14940279_14940280insCAT").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("3:g.114058003del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("3:g.114058003del").getTranscriptConsequences().get(5)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("4:g.9784947_9784948insAGA"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("4:g.9784947_9784948insAGA").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("4:g.77675978_77675979insC"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("4:g.77675978_77675979insC").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("6:g.137519505_137519506del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("6:g.137519505_137519506del").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("6:g.137519505_137519506delinsA"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("6:g.137519505_137519506delinsA").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("7:g.140453136A>T"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("7:g.140453136A>T").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("8:g.37696499_37696500insG"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("8:g.37696499_37696500insG").getTranscriptConsequences().get(2)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("9:g.135797242delinsAT"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("9:g.135797242delinsAT").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("10:g.101953779del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("10:g.101953779del").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("11:g.62393546_62393547delinsAA"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("11:g.62393546_62393547delinsAA").getTranscriptConsequences().get(1)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("12:g.25398285C>A"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("12:g.25398285C>A").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("13:g.28608258_28608275del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("13:g.28608258_28608275del").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("16:g.9057113_9057114insCTG"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("16:g.9057113_9057114insCTG").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("19:g.46141892_46141893delinsAA"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("19:g.46141892_46141893delinsAA").getTranscriptConsequences().get(8)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("22:g.29091840_29091841delinsCA"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("22:g.29091840_29091841delinsCA").getTranscriptConsequences().get(5)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("22:g.36689419_36689421del"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("22:g.36689419_36689421del").getTranscriptConsequences().get(0)
            );

            Mockito.when(
                canonicalTranscriptResolver.resolve(variantMockData.get("4:g.55593656_55593657insCAACTTCCTTATGATCACAAATGGGAGTTTCCCAGAAACAGGCTGAGTTTTGGT"),
                isoformOverrideSource)
            ).thenReturn(
                variantMockData.get("4:g.55593656_55593657insCAACTTCCTTATGATCACAAATGGGAGTTTCCCAGAAACAGGCTGAGTTTTGGT").getTranscriptConsequences().get(0)
            );
        }
    }
}