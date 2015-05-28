package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class H1(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h1", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class H2(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h2", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class H3(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h3", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class H4(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h4", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class H5(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h5", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class H6(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("h6", consumer, initialAttributes), CommonAttributeGroupFacade, PhrasingContent {

}

public open class HEAD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("head", consumer, initialAttributes), CommonAttributeGroupFacade, MetaDataContent {

}

public open class HEADER(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("header", consumer, initialAttributes), CommonAttributeGroupFacade, FlowContent {

}

public open class HGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("hgroup", consumer, initialAttributes), CommonAttributeGroupFacade {

}
fun HGROUP.h1(block : H1.() -> Unit) : Unit = buildH1(emptyMap, consumer, block)

fun HGROUP.h2(block : H2.() -> Unit) : Unit = buildH2(emptyMap, consumer, block)

fun HGROUP.h3(block : H3.() -> Unit) : Unit = buildH3(emptyMap, consumer, block)

fun HGROUP.h4(block : H4.() -> Unit) : Unit = buildH4(emptyMap, consumer, block)

fun HGROUP.h5(block : H5.() -> Unit) : Unit = buildH5(emptyMap, consumer, block)

fun HGROUP.h6(block : H6.() -> Unit) : Unit = buildH6(emptyMap, consumer, block)


public open class HR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("hr", consumer, initialAttributes), CommonAttributeGroupFacade {

}

public open class HTML(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("html", consumer, initialAttributes), CommonAttributeGroupFacade {
    var manifest : String
        get()  = attributeStringString.get(this, "manifest")
        set(newValue) {attributeStringString.set(this, "manifest", newValue)}


}
fun HTML.body(block : BODY.() -> Unit) : Unit = buildBODY(emptyMap, consumer, block)

fun HTML.head(block : HEAD.() -> Unit) : Unit = buildHEAD(emptyMap, consumer, block)


