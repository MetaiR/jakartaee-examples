/*
 * Permission to use, copy, modify, and/or distribute this software for any 
 * purpose with or without fee is hereby granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
 * OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package jakartaee.examples.jsf.managedproperty;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * A bean using a managed property.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
@Named(value = "managedPropertyBean")
@RequestScoped
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class ManagedPropertyBean implements Serializable {
    
    /**
     * Stores the context path using a managed property.
     */
    @Inject
    @ManagedProperty(value = "#{externalContext.requestContextPath}")
    private String contextPath;
    
    /**
     * Get the context path.
     * 
     * @return the context path.
     */
    public String getContextPath() {
        return contextPath;
    }
}
