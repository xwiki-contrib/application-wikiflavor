/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.wikiflavor;

import org.xwiki.component.annotation.Role;
import org.xwiki.job.Job;
import org.xwiki.job.event.status.JobStatus;
import org.xwiki.stability.Unstable;

/**
 * Component to create a wiki and install a flavor in it.
 *
 * @version $Id: $
 * @since 2015-1-M1
 */
@Role
@Unstable
public interface FlavoredWikiCreator
{
    /**
     * Start an asynchronous wiki creation filled with a flavor (an extension).
     *
     * @param request a wiki creation request containing all the information about the wiki to create
     * @throws WikiFlavorException if problem occurs
     *
     * @return the job of the wiki creation
     */
    Job createWiki(WikiCreationRequest request) throws WikiFlavorException;

    /**
     * @param wikiId id of the wiki which is creating by a job
     * @return the status of the wiki creation job
     */
    JobStatus getJobStatus(String wikiId);
}
