using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// Represents a Git Branch
    /// </summary>
    public sealed class RepositoryBranch:  IEquatable<RepositoryBranch>
    { 
        /// <summary>
        /// Identifier of the program. Unique within the space
        /// </summary>
        public string ProgramId { get; private set; }

        /// <summary>
        /// Identifier of the repository
        /// </summary>
        public long? RepositoryId { get; private set; }

        /// <summary>
        /// Name of the branch
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Links
        /// </summary>
        public RepositoryBranchLinks Links { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RepositoryBranch.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RepositoryBranch()
        {
        }

        private RepositoryBranch(string ProgramId, long? RepositoryId, string Name, RepositoryBranchLinks Links)
        {
            
            this.ProgramId = ProgramId;
            
            this.RepositoryId = RepositoryId;
            
            this.Name = Name;
            
            this.Links = Links;
            
        }

        /// <summary>
        /// Returns builder of RepositoryBranch.
        /// </summary>
        /// <returns>RepositoryBranchBuilder</returns>
        public static RepositoryBranchBuilder Builder()
        {
            return new RepositoryBranchBuilder();
        }

        /// <summary>
        /// Returns RepositoryBranchBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RepositoryBranchBuilder</returns>
        public RepositoryBranchBuilder With()
        {
            return Builder()
                .ProgramId(ProgramId)
                .RepositoryId(RepositoryId)
                .Name(Name)
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

        public bool Equals(RepositoryBranch other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RepositoryBranch.
        /// </summary>
        /// <param name="left">Compared (RepositoryBranch</param>
        /// <param name="right">Compared (RepositoryBranch</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RepositoryBranch left, RepositoryBranch right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RepositoryBranch.
        /// </summary>
        /// <param name="left">Compared (RepositoryBranch</param>
        /// <param name="right">Compared (RepositoryBranch</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RepositoryBranch left, RepositoryBranch right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RepositoryBranch.
        /// </summary>
        public sealed class RepositoryBranchBuilder
        {
            private string _ProgramId;
            private long? _RepositoryId;
            private string _Name;
            private RepositoryBranchLinks _Links;

            internal RepositoryBranchBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RepositoryBranch.ProgramId property.
            /// </summary>
            /// <param name="value">Identifier of the program. Unique within the space</param>
            public RepositoryBranchBuilder ProgramId(string value)
            {
                _ProgramId = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryBranch.RepositoryId property.
            /// </summary>
            /// <param name="value">Identifier of the repository</param>
            public RepositoryBranchBuilder RepositoryId(long? value)
            {
                _RepositoryId = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryBranch.Name property.
            /// </summary>
            /// <param name="value">Name of the branch</param>
            public RepositoryBranchBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for RepositoryBranch.Links property.
            /// </summary>
            /// <param name="value">Links</param>
            public RepositoryBranchBuilder Links(RepositoryBranchLinks value)
            {
                _Links = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RepositoryBranch.
            /// </summary>
            /// <returns>RepositoryBranch</returns>
            public RepositoryBranch Build()
            {
                Validate();
                return new RepositoryBranch(
                    ProgramId: _ProgramId,
                    RepositoryId: _RepositoryId,
                    Name: _Name,
                    Links: _Links
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}