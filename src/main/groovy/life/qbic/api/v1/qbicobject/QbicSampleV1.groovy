package life.qbic.api.v1.qbicobject


import ch.ethz.sis.openbis.generic.asapi.v3.dto.sample.Sample
import life.qbic.api.v1.openbis.adapter.AttachmentAdapter
import life.qbic.api.v1.openbis.adapter.SampleAdapter

/**
 *  Converts openbis V3 Sample objects to QbicSampleV1 objects
 *
 *  @author: Sven Fillinger, Friederike Hanssen QBiC
 */
protected class QbicSampleV1 implements SampleAdapter {

    private final Sample openbisSample

    QbicSampleV1(openbisSample) {
        this.openbisSample = openbisSample
    }

    @Override
    List<AttachmentAdapter> getAttachments() {
        return this.openbisSample.attachments.collect { new QbicAttachmentV1(it) }
    }

    @Override
    List<SampleAdapter> getChildren() {
        return this.openbisSample.children.collect { new QbicSampleV1(it) }
    }

    @Override
    String getCode() {
        return this.openbisSample.getCode()
    }

    @Override
    List<QbicSampleV1> getComponents() {
        return this.openbisSample.components.collect { new QbicSampleV1(it) }
    }

    @Override
    QbicSampleV1 getContainer() {
        return new QbicSampleV1(this.openbisSample.container)
    }

    @Override
    List<QbicDataSetV1> getDataSets() {
        return this.openbisSample.dataSets.collect { new QbicDataSetV1(it) }
    }

    @Override
    QbicExperimentV1 getExperiment() {
        return new QbicExperimentV1(this.openbisSample.experiment)
    }

    @Override
    QbicSampleFetchOptionsV1 getFetchOptions() {
        return new QbicSampleFetchOptionsV1(this.openbisSample.fetchOptions)
    }

    @Override
    List<QbicHistoryEntryV1> getHistory() {
        return this.openbisSample.history.collect { new QbicHistoryEntryV1(it) }
    }

    @Override
    QbicSampleIdentifierV1 getIdentifier() {
        return new QbicSampleIdentifierV1(this.openbisSample.identifier)
    }

    @Override
    Map<String, QbicMaterialV1> getMaterialProperties() {
        //TODO: somehow Map<?,?> is inferred, not Map<String, QbicMaterialV1>
        return this.openbisSample.materialProperties.collectEntries { [it.key, new QbicMaterialV1(it.value)] }
    }

    @Override
    QbicMaterialV1 getMaterialProperty(Object propertyName) {
        //TODO check conversion to string? Should null be returned?
        if (propertyName instanceof String)
            return new QbicMaterialV1(this.openbisSample.getMaterialProperty((String) propertyName))
        else
            null
    }

    @Override
    QbicDateV1 getModificationDate() {
        return new QbicDateV1(this.openbisSample.modificationDate)
    }

    @Override
    QbicPersonV1 getModifier() {
        return new QbicPersonV1(this.openbisSample.modifier)
    }

    @Override
    List<QbicSampleV1> getParents() {
        return this.openbisSample.parents.collect { new QbicSampleV1(it) }
    }

    @Override
    QbicPermIdV1 getPermId() {
        return new QbicPermIdV1(this.openbisSample.permId)
    }

    @Override
    QbicProjectV1 getProject() {
        return new QbicProjectV1(this.openbisSample.project)
    }

    @Override
    Map<String, String> getProperties() {
        return this.openbisSample.properties
    }

    @Override
    String getProperty(Object propertyName) {
        if (propertyName instanceof String)
            return this.openbisSample.getProperty(propertyName)
        else
            ""
    }

    @Override
    QbicDateV1 getRegistrationDate() {
        return new QbicDateV1(this.openbisSample.registrationDate)
    }

    @Override
    QbicPersonV1 getRegistrator() {
        return new QbicPersonV1(this.openbisSample.getRegistrator())
    }

    @Override
    QbicSpaceV1 getSpace() {
        return new QbicSpaceV1(this.openbisSample.getSpace())
    }

    @Override
    Set<QbicTagV1> getTags() {
        return this.openbisSample.tags.collect { new QbicTagV1(it) }
    }

    @Override
    QbicSampleTypeV1 getType() {
        return new QbicSampleTypeV1(this.openbisSample.type)
    }
}
