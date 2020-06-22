using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Describes the status of a particular pipeline execution step for display purposes
    /// </summary>
    public sealed class PipelineExecutionStepState:  IEquatable<PipelineExecutionStepState>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// StepId
        /// </summary>
        public string StepId { get; private set; }

        /// <summary>
        /// PhaseId
        /// </summary>
        public string PhaseId { get; private set; }

        /// <summary>
        /// Name of the action
        /// </summary>
        public string Action { get; private set; }

        /// <summary>
        /// Target repository
        /// </summary>
        public string Repository { get; private set; }

        /// <summary>
        /// Target branch
        /// </summary>
        public string Branch { get; private set; }

        /// <summary>
        /// Target environment
        /// </summary>
        public string Environment { get; private set; }

        /// <summary>
        /// Target environment type
        /// </summary>
        public string EnvironmentType { get; private set; }

        /// <summary>
        /// Start time
        /// </summary>
        public DateTime? StartedAt { get; private set; }

        /// <summary>
        /// Date the execution reached a final state
        /// </summary>
        public DateTime? FinishedAt { get; private set; }

        /// <summary>
        /// Information about step result
        /// </summary>
        public Dictionary<string, Object> Details { get; private set; }

        /// <summary>
        /// Action status
        /// </summary>
        public StatusEnum? Status { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public PipelineExecutionStepStateLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use PipelineExecutionStepState.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public PipelineExecutionStepState()
        {
        }

        private PipelineExecutionStepState(string Id, string StepId, string PhaseId, string Action, string Repository, string Branch, string Environment, string EnvironmentType, DateTime? StartedAt, DateTime? FinishedAt, Dictionary<string, Object> Details, StatusEnum? Status, PipelineExecutionStepStateLinks Links)
        {
            
            this.Id = Id;
            
            this.StepId = StepId;
            
            this.PhaseId = PhaseId;
            
            this.Action = Action;
            
            this.Repository = Repository;
            
            this.Branch = Branch;
            
            this.Environment = Environment;
            
            this.EnvironmentType = EnvironmentType;
            
            this.StartedAt = StartedAt;
            
            this.FinishedAt = FinishedAt;
            
            this.Details = Details;
            
            this.Status = Status;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of PipelineExecutionStepState.
        /// </summary>
        /// <returns>PipelineExecutionStepStateBuilder</returns>
        public static PipelineExecutionStepStateBuilder Builder()
        {
            return new PipelineExecutionStepStateBuilder();
        }

        /// <summary>
        /// Returns PipelineExecutionStepStateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PipelineExecutionStepStateBuilder</returns>
        public PipelineExecutionStepStateBuilder With()
        {
            return Builder()
                .Id(Id)
                .StepId(StepId)
                .PhaseId(PhaseId)
                .Action(Action)
                .Repository(Repository)
                .Branch(Branch)
                .Environment(Environment)
                .EnvironmentType(EnvironmentType)
                .StartedAt(StartedAt)
                .FinishedAt(FinishedAt)
                .Details(Details)
                .Status(Status)
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

        public bool Equals(PipelineExecutionStepState other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (PipelineExecutionStepState.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionStepState</param>
        /// <param name="right">Compared (PipelineExecutionStepState</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (PipelineExecutionStepState left, PipelineExecutionStepState right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (PipelineExecutionStepState.
        /// </summary>
        /// <param name="left">Compared (PipelineExecutionStepState</param>
        /// <param name="right">Compared (PipelineExecutionStepState</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (PipelineExecutionStepState left, PipelineExecutionStepState right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of PipelineExecutionStepState.
        /// </summary>
        public sealed class PipelineExecutionStepStateBuilder
        {
            private string _Id;
            private string _StepId;
            private string _PhaseId;
            private string _Action;
            private string _Repository;
            private string _Branch;
            private string _Environment;
            private string _EnvironmentType;
            private DateTime? _StartedAt;
            private DateTime? _FinishedAt;
            private Dictionary<string, Object> _Details;
            private StatusEnum? _Status;
            private PipelineExecutionStepStateLinks _Links;

            internal PipelineExecutionStepStateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public PipelineExecutionStepStateBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.StepId property.
            /// </summary>
            /// <param name="value">StepId</param>
            public PipelineExecutionStepStateBuilder StepId(string value)
            {
                _StepId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.PhaseId property.
            /// </summary>
            /// <param name="value">PhaseId</param>
            public PipelineExecutionStepStateBuilder PhaseId(string value)
            {
                _PhaseId = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Action property.
            /// </summary>
            /// <param name="value">Name of the action</param>
            public PipelineExecutionStepStateBuilder Action(string value)
            {
                _Action = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Repository property.
            /// </summary>
            /// <param name="value">Target repository</param>
            public PipelineExecutionStepStateBuilder Repository(string value)
            {
                _Repository = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Branch property.
            /// </summary>
            /// <param name="value">Target branch</param>
            public PipelineExecutionStepStateBuilder Branch(string value)
            {
                _Branch = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Environment property.
            /// </summary>
            /// <param name="value">Target environment</param>
            public PipelineExecutionStepStateBuilder Environment(string value)
            {
                _Environment = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.EnvironmentType property.
            /// </summary>
            /// <param name="value">Target environment type</param>
            public PipelineExecutionStepStateBuilder EnvironmentType(string value)
            {
                _EnvironmentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.StartedAt property.
            /// </summary>
            /// <param name="value">Start time</param>
            public PipelineExecutionStepStateBuilder StartedAt(DateTime? value)
            {
                _StartedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.FinishedAt property.
            /// </summary>
            /// <param name="value">Date the execution reached a final state</param>
            public PipelineExecutionStepStateBuilder FinishedAt(DateTime? value)
            {
                _FinishedAt = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Details property.
            /// </summary>
            /// <param name="value">Information about step result</param>
            public PipelineExecutionStepStateBuilder Details(Dictionary<string, Object> value)
            {
                _Details = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Status property.
            /// </summary>
            /// <param name="value">Action status</param>
            public PipelineExecutionStepStateBuilder Status(StatusEnum? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for PipelineExecutionStepState.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public PipelineExecutionStepStateBuilder Links(PipelineExecutionStepStateLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of PipelineExecutionStepState.
            /// </summary>
            /// <returns>PipelineExecutionStepState</returns>
            public PipelineExecutionStepState Build()
            {
                Validate();
                return new PipelineExecutionStepState(
                    Id: _Id,
                    StepId: _StepId,
                    PhaseId: _PhaseId,
                    Action: _Action,
                    Repository: _Repository,
                    Branch: _Branch,
                    Environment: _Environment,
                    EnvironmentType: _EnvironmentType,
                    StartedAt: _StartedAt,
                    FinishedAt: _FinishedAt,
                    Details: _Details,
                    Status: _Status,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum StatusEnum { NOTSTARTED, RUNNING, FINISHED, ERROR, ROLLINGBACK, ROLLEDBACK, WAITING, CANCELLED, FAILED };
    }
}