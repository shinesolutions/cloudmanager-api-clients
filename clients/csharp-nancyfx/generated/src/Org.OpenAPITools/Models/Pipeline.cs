using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes a __CI/CD Pipeline__
    /// </summary>
    public sealed class Pipeline:  IEquatable<Pipeline>
    { 
        /// <summary>
        /// Identifier of the pipeline. Unique within the program.
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        public string ProgramId { get; private set; }

        /// <summary>
        /// Name of the pipeline
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
        /// </summary>
        public TriggerEnum? Trigger { get; private set; }

        /// <summary>
        /// Pipeline status
        /// </summary>
        public StatusEnum? Status { get; private set; }

        /// <summary>
        /// Create date
        /// </summary>
        public DateTime? CreatedAt { get; private set; }

        /// <summary>
        /// Update date
        /// </summary>
        public DateTime? UpdatedAt { get; private set; }

        /// <summary>
        /// Last pipeline execution start
        /// </summary>
        public DateTime? LastStartedAt { get; private set; }

        /// <summary>
        /// Last pipeline execution end
        /// </summary>
        public DateTime? LastFinishedAt { get; private set; }

        /// <summary>
        /// Pipeline phases in execution order
        /// </summary>
        public List<PipelinePhase> Phases { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public PipelineLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Pipeline.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Pipeline()
        {
        }

        private Pipeline(string Id, string ProgramId, string Name, TriggerEnum? Trigger, StatusEnum? Status, DateTime? CreatedAt, DateTime? UpdatedAt, DateTime? LastStartedAt, DateTime? LastFinishedAt, List<PipelinePhase> Phases, PipelineLinks Links)
        {
            
            this.Id = Id;
            
            this.ProgramId = ProgramId;
            
            this.Name = Name;
            
            this.Trigger = Trigger;
            
            this.Status = Status;
            
            this.CreatedAt = CreatedAt;
            
            this.UpdatedAt = UpdatedAt;
            
            this.LastStartedAt = LastStartedAt;
            
            this.LastFinishedAt = LastFinishedAt;
            
            this.Phases = Phases;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of Pipeline.
        /// </summary>
        /// <returns>PipelineBuilder</returns>
        public static PipelineBuilder Builder()
        {
            return new PipelineBuilder();
        }

        /// <summary>
        /// Returns PipelineBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineBuilder</returns>
        public PipelineBuilder With()
        {
            return Builder()
                .Id(Id)
                .ProgramId(ProgramId)
                .Name(Name)
                .Trigger(Trigger)
                .Status(Status)
                .CreatedAt(CreatedAt)
                .UpdatedAt(UpdatedAt)
                .LastStartedAt(LastStartedAt)
                .LastFinishedAt(LastFinishedAt)
                .Phases(Phases)
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

        public bool Equals(Pipeline other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Pipeline.
        /// </summary>
        /// <param name="left">Compared (Pipeline</param>
        /// <param name="right">Compared (Pipeline</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Pipeline left, Pipeline right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Pipeline.
        /// </summary>
        /// <param name="left">Compared (Pipeline</param>
        /// <param name="right">Compared (Pipeline</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Pipeline left, Pipeline right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Pipeline.
        /// </summary>
        public sealed class PipelineBuilder
        {
            private string _Id;
            private string _ProgramId;
            private string _Name;
            private TriggerEnum? _Trigger;
            private StatusEnum? _Status;
            private DateTime? _CreatedAt;
            private DateTime? _UpdatedAt;
            private DateTime? _LastStartedAt;
            private DateTime? _LastFinishedAt;
            private List<PipelinePhase> _Phases;
            private PipelineLinks _Links;

            internal PipelineBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Pipeline.Id property.
            /// </summary>
            /// <param name="value">Identifier of the pipeline. Unique within the program.</param>
            public PipelineBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.ProgramId property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space.</param>
            public PipelineBuilder ProgramId(string value)
            {
                _ProgramId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.Name property.
            /// </summary>
            /// <param name="value">Name of the pipeline</param>
            public PipelineBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.Trigger property.
            /// </summary>
            /// <param name="value">How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}</param>
            public PipelineBuilder Trigger(TriggerEnum? value)
            {
                _Trigger = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.Status property.
            /// </summary>
            /// <param name="value">Pipeline status</param>
            public PipelineBuilder Status(StatusEnum? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.CreatedAt property.
            /// </summary>
            /// <param name="value">Create date</param>
            public PipelineBuilder CreatedAt(DateTime? value)
            {
                _CreatedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.UpdatedAt property.
            /// </summary>
            /// <param name="value">Update date</param>
            public PipelineBuilder UpdatedAt(DateTime? value)
            {
                _UpdatedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.LastStartedAt property.
            /// </summary>
            /// <param name="value">Last pipeline execution start</param>
            public PipelineBuilder LastStartedAt(DateTime? value)
            {
                _LastStartedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.LastFinishedAt property.
            /// </summary>
            /// <param name="value">Last pipeline execution end</param>
            public PipelineBuilder LastFinishedAt(DateTime? value)
            {
                _LastFinishedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.Phases property.
            /// </summary>
            /// <param name="value">Pipeline phases in execution order</param>
            public PipelineBuilder Phases(List<PipelinePhase> value)
            {
                _Phases = value;
                return this;
            }

            /// <summary>
            /// Sets value for Pipeline.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public PipelineBuilder Links(PipelineLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Pipeline.
            /// </summary>
            /// <returns>Pipeline</returns>
            public Pipeline Build()
            {
                Validate();
                return new Pipeline(
                    Id: _Id,
                    ProgramId: _ProgramId,
                    Name: _Name,
                    Trigger: _Trigger,
                    Status: _Status,
                    CreatedAt: _CreatedAt,
                    UpdatedAt: _UpdatedAt,
                    LastStartedAt: _LastStartedAt,
                    LastFinishedAt: _LastFinishedAt,
                    Phases: _Phases,
                    Links: _Links
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for Pipeline and cannot be null");
                } 
                if (_Phases == null)
                {
                    throw new ArgumentException("Phases is a required property for Pipeline and cannot be null");
                } 
            }
        }

        
        public enum TriggerEnum { ONCOMMIT, MANUAL, SCHEDULE };
        public enum StatusEnum { IDLE, BUSY, WAITING };
    }
}