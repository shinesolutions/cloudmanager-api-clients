using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Wraps a pipeline execution
    /// </summary>
    public sealed class PipelineExecution:  IEquatable<PipelineExecution>
    { 
        /// <summary>
        /// Pipeline execution identifier
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        public string ProgramId { get; private set; }

        /// <summary>
        /// Identifier of the pipeline. Unique within the space.
        /// </summary>
        public string PipelineId { get; private set; }

        /// <summary>
        /// Version of the artifacts generated during this execution
        /// </summary>
        public string ArtifactsVersion { get; private set; }

        /// <summary>
        /// AdobeID who started the pipeline. Empty for auto triggered builds
        /// </summary>
        public string User { get; private set; }

        /// <summary>
        /// Status of the execution
        /// </summary>
        public StatusEnum? Status { get; private set; }

        /// <summary>
        /// How the execution was triggered.
        /// </summary>
        public TriggerEnum? Trigger { get; private set; }

        /// <summary>
        /// Start time
        /// </summary>
        public DateTime? CreatedAt { get; private set; }

        /// <summary>
        /// Date of last status change
        /// </summary>
        public DateTime? UpdatedAt { get; private set; }

        /// <summary>
        /// Date the execution reached a final state
        /// </summary>
        public DateTime? FinishedAt { get; private set; }

        /// <summary>
        /// Embedded
        /// </summary>
        public PipelineExecutionEmbedded Embedded { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public PipelineExecutionLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecution.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecution()
        {
        }

        private PipelineExecution(string Id, string ProgramId, string PipelineId, string ArtifactsVersion, string User, StatusEnum? Status, TriggerEnum? Trigger, DateTime? CreatedAt, DateTime? UpdatedAt, DateTime? FinishedAt, PipelineExecutionEmbedded Embedded, PipelineExecutionLinks Links)
        {
            
            this.Id = Id;
            
            this.ProgramId = ProgramId;
            
            this.PipelineId = PipelineId;
            
            this.ArtifactsVersion = ArtifactsVersion;
            
            this.User = User;
            
            this.Status = Status;
            
            this.Trigger = Trigger;
            
            this.CreatedAt = CreatedAt;
            
            this.UpdatedAt = UpdatedAt;
            
            this.FinishedAt = FinishedAt;
            
            this.Embedded = Embedded;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecution.
        /// </summary>
        /// <returns>PipelineExecutionBuilder</returns>
        public static PipelineExecutionBuilder Builder()
        {
            return new PipelineExecutionBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionBuilder</returns>
        public PipelineExecutionBuilder With()
        {
            return Builder()
                .Id(Id)
                .ProgramId(ProgramId)
                .PipelineId(PipelineId)
                .ArtifactsVersion(ArtifactsVersion)
                .User(User)
                .Status(Status)
                .Trigger(Trigger)
                .CreatedAt(CreatedAt)
                .UpdatedAt(UpdatedAt)
                .FinishedAt(FinishedAt)
                .Embedded(Embedded)
                .Links(Links);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(PipelineExecution other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecution.
        /// </summary>
        /// <param name="left">Compared (PipelineExecution</param>
        /// <param name="right">Compared (PipelineExecution</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecution left, PipelineExecution right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecution.
        /// </summary>
        /// <param name="left">Compared (PipelineExecution</param>
        /// <param name="right">Compared (PipelineExecution</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecution left, PipelineExecution right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecution.
        /// </summary>
        public sealed class PipelineExecutionBuilder
        {
            private string _Id;
            private string _ProgramId;
            private string _PipelineId;
            private string _ArtifactsVersion;
            private string _User;
            private StatusEnum? _Status;
            private TriggerEnum? _Trigger;
            private DateTime? _CreatedAt;
            private DateTime? _UpdatedAt;
            private DateTime? _FinishedAt;
            private PipelineExecutionEmbedded _Embedded;
            private PipelineExecutionLinks _Links;

            internal PipelineExecutionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecution.Id property.
            /// </summary>
            /// <param name="value">Pipeline execution identifier</param>
            public PipelineExecutionBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.ProgramId property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space.</param>
            public PipelineExecutionBuilder ProgramId(string value)
            {
                _ProgramId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.PipelineId property.
            /// </summary>
            /// <param name="value">Identifier of the pipeline. Unique within the space.</param>
            public PipelineExecutionBuilder PipelineId(string value)
            {
                _PipelineId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.ArtifactsVersion property.
            /// </summary>
            /// <param name="value">Version of the artifacts generated during this execution</param>
            public PipelineExecutionBuilder ArtifactsVersion(string value)
            {
                _ArtifactsVersion = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.User property.
            /// </summary>
            /// <param name="value">AdobeID who started the pipeline. Empty for auto triggered builds</param>
            public PipelineExecutionBuilder User(string value)
            {
                _User = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.Status property.
            /// </summary>
            /// <param name="value">Status of the execution</param>
            public PipelineExecutionBuilder Status(StatusEnum? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.Trigger property.
            /// </summary>
            /// <param name="value">How the execution was triggered.</param>
            public PipelineExecutionBuilder Trigger(TriggerEnum? value)
            {
                _Trigger = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.CreatedAt property.
            /// </summary>
            /// <param name="value">Start time</param>
            public PipelineExecutionBuilder CreatedAt(DateTime? value)
            {
                _CreatedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.UpdatedAt property.
            /// </summary>
            /// <param name="value">Date of last status change</param>
            public PipelineExecutionBuilder UpdatedAt(DateTime? value)
            {
                _UpdatedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.FinishedAt property.
            /// </summary>
            /// <param name="value">Date the execution reached a final state</param>
            public PipelineExecutionBuilder FinishedAt(DateTime? value)
            {
                _FinishedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.Embedded property.
            /// </summary>
            /// <param name="value">Embedded</param>
            public PipelineExecutionBuilder Embedded(PipelineExecutionEmbedded value)
            {
                _Embedded = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecution.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public PipelineExecutionBuilder Links(PipelineExecutionLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecution.
            /// </summary>
            /// <returns>PipelineExecution</returns>
            public PipelineExecution Build()
            {
                Validate();
                return new PipelineExecution(
                    Id: _Id,
                    ProgramId: _ProgramId,
                    PipelineId: _PipelineId,
                    ArtifactsVersion: _ArtifactsVersion,
                    User: _User,
                    Status: _Status,
                    Trigger: _Trigger,
                    CreatedAt: _CreatedAt,
                    UpdatedAt: _UpdatedAt,
                    FinishedAt: _FinishedAt,
                    Embedded: _Embedded,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum StatusEnum { NOTSTARTED, RUNNING, CANCELLING, CANCELLED, FINISHED, ERROR, FAILED };
        public enum TriggerEnum { ONCOMMIT, MANUAL, SCHEDULE, PUSHUPGRADES };
    }
}