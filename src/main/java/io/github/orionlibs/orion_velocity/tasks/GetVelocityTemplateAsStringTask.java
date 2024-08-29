package io.github.orionlibs.orion_velocity.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.io.StringWriter;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;

public class GetVelocityTemplateAsStringTask
{
    public static String run(VelocityEngine velocityEngine, VelocityContext velocityContext, String velocityTemplateName, String velocityTemplate) throws ParseErrorException
    {
        Assert.notNull(velocityEngine, "The given velocityEngine input cannot be null.");
        Assert.notNull(velocityContext, "The given velocityContext input cannot be null.");
        Assert.notEmpty(velocityTemplate, "The given velocityTemplate input cannot be null/empty.");
        StringWriter writer = new StringWriter();
        velocityEngine.evaluate(velocityContext, writer, velocityTemplateName, velocityTemplate);
        return writer.toString();
    }
}