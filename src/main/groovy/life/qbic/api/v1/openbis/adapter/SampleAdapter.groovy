package life.qbic.api.v1.openbis.adapter

import life.qbic.api.v1.qbicobject.QbicAttachment
import life.qbic.api.v1.qbicobject.QbicSampleV1

/**
 * Provides an access interface for `QbicSampleV1` objects.
 *
 * @author: Sven Fillinger, QBiC
 */
interface SampleAdapter {

    List<QbicAttachment> getAttachments()

    List<QbicSampleV1> getChildren()

    String getCode()

    List<QbicSampleV1> getComponents()

    QbicSampleV1 getContainer()

    def getDataSets()

    def getExperiment()

    def getFetchOptions()

    def getHistory()

    def getIdentifier()

    def getMaterialProperties()

    def getMaterialProperty(propertyName)

    def getModificationDate()

    def getModifier()

    def getParents()

    def getPermId()

    def getProject()

    def getProperties()

    def getProperty(propertyName)

    def getRegistrationDate()

    def getRegistrator()

    def getSpace()

    def getTags()

    def getType()

    def setChildren(List<SampleAdapter> children)
}
