package life.qbic.api.v1.qbicobject

import ch.ethz.sis.openbis.generic.asapi.v3.dto.sample.Sample
import life.qbic.api.v1.openbis.adapter.*

/**
 *  Converts openbis V3 Sample objects to QbicSampleV1 objects
 * Currently, all getter methods for openbis samples are implemented
 * @author: Sven Fillinger, Friederike Hanssen QBiC
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
    List<SampleAdapter> getComponents() {
        return this.openbisSample.components.collect { new QbicSampleV1(it) }
    }

    @Override
    SampleAdapter getContainer() {
        return new QbicSampleV1(this.openbisSample.container)
    }

    @Override
    List<DataSetAdapter> getDataSets() {
        return this.openbisSample.dataSets.collect { new QbicDataSetV1(it) }
    }

    @Override
    ExperimentAdapter getExperiment() {
        return new QbicExperimentV1(this.openbisSample.experiment)
    }

    @Override
    SampleFetchOptionsAdapter getFetchOptions() {
        return new QbicSampleFetchOptionsV1(this.openbisSample.fetchOptions)
    }

    @Override
    List<HistoryEntryAdapter> getHistory() {
        return this.openbisSample.history.collect { new QbicHistoryEntryV1(it) }
    }

    @Override
    SampleIdentifierAdapter getIdentifier() {
        return new QbicSampleIdentifierV1(this.openbisSample.identifier)
    }

    @Override
    Map<String, MaterialAdapter> getMaterialProperties() {
        //TODO: somehow Map<?,?> is inferred, not Map<String, QbicMaterialV1>
        return this.openbisSample.materialProperties.collectEntries { [it.key, new QbicMaterialV1(it.value)] }
    }

    @Override
    MaterialAdapter getMaterialProperty(Object propertyName) {
        //TODO check conversion to string? Should null be returned?
        if (propertyName instanceof String)
            return new QbicMaterialV1(this.openbisSample.getMaterialProperty((String) propertyName))
        else
            null
    }

    @Override
    Date getModificationDate() {
        return this.openbisSample.modificationDate
    }

    @Override
    PersonAdapter getModifier() {
        return new QbicPersonV1(this.openbisSample.modifier)
    }

    @Override
    List<SampleAdapter> getParents() {
        return this.openbisSample.parents.collect { new QbicSampleV1(it) }
    }

    @Override
    SamplePermIdAdapter getPermId() {
        return new QbicSamplePermIdV1(this.openbisSample.permId)
    }

    @Override
    ProjectAdapter getProject() {
        return new QbicProjectV1(this.openbisSample.project)
    }

    @Override
    Map<String, String> getProperties() {
        return this.openbisSample.properties
    }

    @Override
    String getProperty(Object propertyName) {
        //TODO check conversion to string? Should null be returned?
        if (propertyName instanceof String)
            return this.openbisSample.getProperty(propertyName)
        else
            ""
    }

    @Override
    Date getRegistrationDate() {
        return this.openbisSample.registrationDate
    }

    @Override
    PersonAdapter getRegistrator() {
        return new QbicPersonV1(this.openbisSample.getRegistrator())
    }

    @Override
    SpaceAdapter getSpace() {
        return new QbicSpaceV1(this.openbisSample.getSpace())
    }

    @Override
    Set<TagAdapter> getTags() {
        return this.openbisSample.tags.collect { new QbicTagV1(it) }
    }

    @Override
    SampleTypeAdapter getType() {
        return new QbicSampleTypeV1(this.openbisSample.type)
    }
}
